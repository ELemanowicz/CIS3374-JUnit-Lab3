package AdmiteratorTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)
public class admiteratorTest {

	@Test
	@Parameters(method = Admiterator.admit(1,))
	public void admitTest() {
		fail("Not yet implemented");
	}

}
