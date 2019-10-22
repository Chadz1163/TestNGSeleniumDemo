package UITest.testCase;


import UITest.base.DriverBase;

/**
 * @author shidao.zhang
 */
public class CaseBase {
    public DriverBase initDriver(String brower) {
        return new DriverBase(brower);
    }
}
