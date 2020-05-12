package com.qa.ilCarro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSite extends TestBase{

    @Test(enabled = false)
    public void isSiteOpenedOnSearchPage(){
        String currenURL = app.getSession().getURL();
        Assert.assertEquals(currenURL, "https://ilcarro-dev-v1.firebaseapp.com/");
    }
}
