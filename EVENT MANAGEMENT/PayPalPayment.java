public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay() {
        System.out.println("Processing PayPal payment for email: " + email);
        return true; // Assume payment is successful
    }
}
