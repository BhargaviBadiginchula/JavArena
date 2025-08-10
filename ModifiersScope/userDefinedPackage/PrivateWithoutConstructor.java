package userDefinedPackage;

public class PrivateWithoutConstructor {
    private String secretKey;

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void getSecretKey() {
        System.out.println(secretKey);
    }
}
