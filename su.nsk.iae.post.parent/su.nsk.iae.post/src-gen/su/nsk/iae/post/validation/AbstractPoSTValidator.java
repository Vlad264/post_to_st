/*
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPoSTValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(su.nsk.iae.post.poST.PoSTPackage.eINSTANCE);
		return result;
	}
}
