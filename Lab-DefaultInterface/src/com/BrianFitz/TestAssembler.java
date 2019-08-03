package com.BrianFitz;

import com.Brian.builders.Assembler;
import com.Brian.interfaces.Packager;
import com.Brian.model.Package;

public class TestAssembler {
	public static void main(String[] args) {
		Packager packager = new Assembler();
		Package myPackage = packager.assemblePackage();
		System.out.println(myPackage);
	}
}
