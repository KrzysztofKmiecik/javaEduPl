package BuilderChaining;

public class Pizza {
    public static class Builder {
        private String ciasto;
        private String ser;
        private String mieso;
        private String warzywa;
        private String sos;

        public Builder(String ciasto, String ser) {  // to są wymagane parametry
            this.ciasto = ciasto;
            this.ser = ser;
        }

        public Builder mieso(String mieso) {
            this.mieso = mieso;
            return this;
        }
        public Builder warzywa(String warzywa) {
            this.warzywa = warzywa;
            return this;
        }
        public Builder sos(String sos) {
            this.sos = sos;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }




    private String ciasto;
    private String ser;
    private String mieso;
    private String warzywa;
    private String sos;
    private String dodatki;


    public Pizza (Builder builder){
        this.ciasto=builder.ciasto;
        this.ser= builder.ser;
        this.mieso= builder.mieso;
        this.warzywa= builder.warzywa;
        this.sos= builder.sos;
    }




    public String getCiasto() {
        return ciasto;
    }
    public String getSer() {
        return ser;
    }
    public String getMieso() {
        return mieso;
    }
    public String getWarzywa() {
        return warzywa;
    }
    public String getSos() {
        return sos;
    }
}
