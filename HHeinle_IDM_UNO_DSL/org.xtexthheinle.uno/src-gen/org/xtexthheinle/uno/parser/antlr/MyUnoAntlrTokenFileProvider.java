/*
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyUnoAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtexthheinle/uno/parser/antlr/internal/InternalMyUno.tokens");
	}
}
