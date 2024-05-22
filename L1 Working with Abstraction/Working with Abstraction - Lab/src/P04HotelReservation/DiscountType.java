package P04HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SECOND_VISIT(0.9),
    NONE(1);

    private final double factor;
    DiscountType (double factor){
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
