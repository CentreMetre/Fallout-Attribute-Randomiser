public class User {

    private String operatingSystem;

    public void User()
    {
        this.operatingSystem = System.getProperty("os.name");
        switch (this.operatingSystem)
        {
            case "Windows":

        }
    }
}
