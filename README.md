A simple single phase transformer solver. By running TransformerTest.java
it will test a simple transformer. This was created so I did not have to
keep repeatedly solving transformer problems (and so I could check my
answers when practising).

The transformer arguments are:
s: the apparent power of the transformer (i.e. 20 kVA)
a: the turns ratio
r1: the primary winding resistance
r2: the secondary winding resistance
l1: the primary winding reactance
l2: the secondary winding reactance
rc: the core resistance
lc: the core reactance
pf: the load power factor
v: the load voltage

This was not well commented, and done about a year ago.
But hopefully the transformer solver will output the effeciency of the 
system, the regulation and the power to the load (in kW).
