/*************************************************************************************
 * Copyright (c) 2012-2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.jboss.tools.arquillian.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@Suite.SuiteClasses({
	ArquillianCoreTest.class,
	ArquillianValidatorTest.class,
	CheckArquillianModificationsTest.class,
	CreateDeploymentMethodTest.class,
	GenerateDeploymentMethodTest.class,
	DeployableContainerTest.class,
	ArquillianClassloaderTest.class,
	GenerateDeploymenMethodMarkerResolutionTest.class,
	ArquillianFilterTest.class,
	ValidateArchiveNameTest.class,
	DependentClassesTest.class,
	WorkspaceProjectsTest.class,
	ArchivesTest.class,
	AddArquillianSupportTest.class,
	MavenResolverTest.class,
	ArquillianXmlEditorTest.class,
	InvalidDeploymentMethodTest.class,
	ArquillianConfiguratorTest.class,
	AbstractDeploymentMethodTest.class,
	DependentClasses2Test.class,
})

@RunWith(Suite.class)
public class ArquillianAllTests {

}
