package com.ashuboi.gameapp.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor, equals
// hashcode and toString are automatically created
// Released in JDK16.
public record Person (String name, int age, AddressHome addressHome) {} // no setter getter need to be created
