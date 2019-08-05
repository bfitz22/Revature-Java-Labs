package com.Brian;

import com.Brian.assemblers.MyAssembler;
import com.yourname.interfaces.Packager;
import com.yourname.model.Package;

public class TestAssembler {
	public static void main(String[] args) {
		Packager packager = new MyAssembler();
		Package myPackage = packager.assemblePackage("This is my new content description");
		System.out.println(myPackage);
	}
}
