# ShippingOrg
Assignment (portfolio 1) for course "Software Development" - attended fall 2022.

Partial description of the assignment

You are going to develop an object-oriented tool for a shipping organization which deals with three 
different types of vessels: container vessels, tankers and RoRo vessels. All vessels have a flag nation, 
a draft, length and width. They will also all carry cargo and a container vessel can carry a specific 
number of containers. The tankers have 1-10 compartments which each has a capacity and which 
each can be filled to some level. The RoRo vessels has a total amount of lane meters and can carry 
cars and trucks, each car is 8 meter long and each truck is 30 meters. 

Implement classes to represent these vessels. The implementation should use inheritance and 
polymorphism. 
Provide methods loadingCargo() and utilitylevelofCapacity() for all vessels. The 
method loadingCargo() is used to set relevant information for vessels and make the cargo 
amount accessible through methods. The method utilitylevelofCapacity() should compute the fraction of the total capacity that is used.
For tankers a compartment is assumed to be utilized if it is not empty since it then cannot be used for other products.
