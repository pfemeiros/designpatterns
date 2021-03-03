package br.com.pfemeiros.designpatterns.builder;

public class CreditCard {

    public static class Builder {

        private Long number;
        private String brand;
        private Double limit;

        public Builder(Long number) {
            this.number = number;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withLimit(Double limit) {
            this.limit = limit;
            return this;
        }

        public CreditCard build(){
            CreditCard creditCard = new CreditCard();
            creditCard.number = this.number;
            creditCard.brand = this.brand;
            creditCard.limit = this.limit;
            return creditCard;
        }
    }

    private Long number;
    private String brand;
    private Double limit;

    private CreditCard() {

    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", brand='" + brand + '\'' +
                ", limit=" + limit +
                '}';
    }
}
