/*
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtexthheinle.uno.MyUnoRuntimeModule;
import org.xtexthheinle.uno.MyUnoStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyUnoIdeSetup extends MyUnoStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyUnoRuntimeModule(), new MyUnoIdeModule()));
	}
	
}
