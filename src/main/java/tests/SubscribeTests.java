package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscribeTests extends BaseTests {
    @Test
    public void ValidatePackagesForSaudiArabia(){


        // Navigate to the subscription page
        subscribePage.OpenSaudiArabiaSubscriptionPage();

        // Find the package elements and add them to ArrayList
        subscribePage.getPackagesNamesList();

        // Verify the package names and count
        Assert.assertEquals(subscribePage.PlansNamesList.size(),4);
        assert(subscribePage.PlansNamesList.get(0).contains("لايت"));
        assert(subscribePage.PlansNamesList.get(1).contains("الأساسية"));
        assert(subscribePage.PlansNamesList.get(2).contains("بريميوم"));

        // Find the currency elements and add them to ArrayList
        subscribePage.getPackagesPricesList();

        // Verify the currency values and count
        Assert.assertEquals(subscribePage.PlansCurrenciesList.size(),4);
        assert(subscribePage.PlansCurrenciesList.get(0).equals("15 ريال سعودي/شهر"));
        assert(subscribePage.PlansCurrenciesList.get(1).equals("25 ريال سعودي/شهر"));
        assert(subscribePage.PlansCurrenciesList.get(2).equals("60 ريال سعودي/شهر"));
    }
    @Test
    public void ValidateBahrainPackages(){


        // Navigate to the subscription page
        subscribePage.OpenBahrainSubscriptionPage();

        // Find the package elements and add them to ArrayList
        subscribePage.getPackagesNamesList();

        // Verify the package names and count
        Assert.assertEquals(subscribePage.PlansNamesList.size(),4);
        assert(subscribePage.PlansNamesList.get(0).contains("لايت"));
        assert(subscribePage.PlansNamesList.get(1).contains("الأساسية"));
        assert(subscribePage.PlansNamesList.get(2).contains("بريميوم"));

        // Find the currency elements and add them to ArrayList
        subscribePage.getPackagesPricesList();

        // Verify the currency values and count
        Assert.assertEquals(subscribePage.PlansCurrenciesList.size(),4);
        assert(subscribePage.PlansCurrenciesList.get(0).equals("2 دينار بحرينى/شهر"));
        assert(subscribePage.PlansCurrenciesList.get(1).equals("3 دينار بحرينى/شهر"));
        assert(subscribePage.PlansCurrenciesList.get(2).equals("6 دينار بحرينى/شهر"));
    }

    @Test
    public void ValidatekuwaitPackages(){


        // Navigate to the subscription page
        subscribePage.OpenkuwaitSubscriptionPage();

        // Find the package elements and add them to ArrayList
        subscribePage.getPackagesNamesList();

        // Verify the package names and count
        Assert.assertEquals(subscribePage.PlansNamesList.size(),4);
        assert(subscribePage.PlansNamesList.get(0).contains("لايت"));
        assert(subscribePage.PlansNamesList.get(1).contains("الأساسية"));
        assert(subscribePage.PlansNamesList.get(2).contains("بريميوم"));

        // Find the currency elements and add them to ArrayList
        subscribePage.getPackagesPricesList();

        // Verify the currency values and count
        Assert.assertEquals(subscribePage.PlansCurrenciesList.size(),4);
        assert(subscribePage.PlansCurrenciesList.get(0).equals("1.2 دينار كويتي/شهر"));
        assert(subscribePage.PlansCurrenciesList.get(1).equals("2.5 دينار كويتي/شهر"));
        assert(subscribePage.PlansCurrenciesList.get(2).equals("4.8 دينار كويتي/شهر"));
    }
}
