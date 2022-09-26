Output
------

One implementation.
Another implementation.
One implementation.
Another implementation.

Explanations
------------

Code											Declared Type	Selected Method				Concrete Type
final SuperClass superClass = new SubClass();	SuperClass		SuperClass.equals(Object)	SubClass
superClass.equals("");											SubClass.equals(Object)
final SubClass subClass = new SubClass();		SubClass		SuperClass.equals(Object)	SubClass
((SuperClass) subClass).equals("");								SubClass.equals(Object)
