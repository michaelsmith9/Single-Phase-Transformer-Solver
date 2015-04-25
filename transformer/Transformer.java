package transformer;

import complex.*;
import java.lang.Math;

public class Transformer {
	
	// apparent power
	private double s;
	//turns ratio
	private double a;
	// primary resistance
	private double r1;
	// secondary resistance
	private double r2;
	// primary reactance
	private double l1;
	// secondary reactance
	private double l2;
	// core resistance
	private double rc;
	// core reactance
	private double lc;
	// load pf
	private double pf;
	// load v
	private double v;
	// in class values

	private double pLoss, pLoad, vNoLoad;
	
	private double V2Return, V2ang;
	
	public Transformer(double s, double a, double r1, double l1, double rc, 
			double lc, double r2, double l2, double pf, double v) {
		this.s = s;
		this.a=a;
		this.r1=r1;
		this.l1 = l1;
		this.rc = rc;
		this.lc = lc;
		this.r2 = r2;
		this.l2 = l2;
		this.pf = pf;
		this.v =v;
		// load = v angle 0
		calculations();
	}
	
	private void calculations() {
		Phasor i2 = new Phasor((this.s/this.v), -Math.acos(this.pf)*180/Math.PI);
		Phasor vl = new Phasor(this.v, 0);
		Phasor i1 = new Phasor(i2.r()/this.a, i2.angle());
		
		RecToPol r2l2 = new RecToPol(this.r2, this.l2);
		
		MultPhasors i2r2l2 = new MultPhasors(i2.r(), i2.angle(), r2l2.magnitude(), r2l2.angleDeg());
		AddPhasors vli2r2l2 = new AddPhasors(vl.r(), vl.angle(), i2r2l2.resMag(), i2r2l2.resAng());
		
		Phasor v2 = new Phasor(vli2r2l2.resMag(), vli2r2l2.resAng());
		
		Phasor v1 = new Phasor(v2.r()*this.a, v2.angle());
		
		Phasor Rc = new Phasor(this.rc, 0);
		Phasor Lc = new Phasor(this.lc, 90);
		
		DivPhasors IRc = new DivPhasors(v1.r(), v1.angle(), Rc.r(), Rc.angle());
		DivPhasors ILc = new DivPhasors(v1.r(), v1.angle(), Lc.r(), Lc.angle());
		
		AddPhasors Ic = new AddPhasors(IRc.resMag(), IRc.resAng(), ILc.resMag(), ILc.resAng());
		
		AddPhasors Is = new AddPhasors(i1.r(), i1.angle(), Ic.resMag(), Ic.resAng());
		
		RecToPol r1l1 = new RecToPol(this.r1, this.l1);
		MultPhasors Isr1l1 = new MultPhasors(Is.resMag(), Is.resAng(), r1l1.magnitude(), r1l1.angleDeg());
		AddPhasors v1Isr1l1 = new AddPhasors(v1.r(), v1.angle(), Isr1l1.resMag(), Isr1l1.resAng());
		
		Phasor vs = new Phasor(v1Isr1l1.resMag(), v1Isr1l1.resAng());
		
		pLoss = Math.pow(Is.resMag(), 2)*this.r1 + Math.pow(i2.r(), 2)*this.r2 + Math.pow(v1.r(), 2)/this.rc;
		
		this.vNoLoad = vs.r()/this.a;
		
		this.V2Return = v2.r();
		this.V2ang = v2.angle();
		pLoad = v2.r()*i2.r()*this.pf;
		
	}
	
	public double regulation() {
		return ((this.vNoLoad - this.v)/this.v)*100;
	}
	
	public double efficiency() {
		return (pLoad/(pLoad+pLoss))*100;
	}
	
	public double pLoad() {
		return pLoad;
	}
	
	public void setLoad(double pf, double v) {
		this.pf = pf;
		this.v =v;
		calculations();
	}
}
