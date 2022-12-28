import org.testng.Assert;


public class CustomAssertions extends Assert{

    public static void CompareURL(String expectedURL, String actualURL) {
        Assert.assertEquals(expectedURL, actualURL,"This URL its incorrect");
    }

    public static void Comparenav(String expectedid, String currentid) {
        Assert.assertEquals(expectedid,currentid,"Navbar doesn`t exists");
    }


    public static void CompareBrandImage(String expectedBI, String currentBI) {
                    Assert.assertEquals(expectedBI,currentBI,"Brand Image doesn`t exists");
        }

    public static void CompareBrandText(String expectedBTxt, String currentBTxt) {
        Assert.assertEquals(expectedBTxt,currentBTxt,"Brand Text doesn`t correct");
    }
}

