public class MaquinaDeCafe
    {
        private int agua;
        private int cafe;
        private int crema;
        private int vasos;

        @Override
        public String toString() {
            return "\nLa Cafetera ahora tiene: " +
                    "de agua: " + agua + "ml" +
                    ", de cafe: " + cafe + "g" +
                    ", de crema: " + crema + "ml" +
                    ", de vasos: " + vasos + " vasos";
        }

        public int getAgua() {
            return agua;
        }

        public void setAgua(int agua) {
            this.agua = agua;
        }

        public int getCafe() {
            return cafe;
        }

        public void setCafe(int cafe) {
            this.cafe = cafe;
        }

        public int getCrema() {
            return crema;
        }

        public void setCrema(int crema) {
            this.crema = crema;
        }

        public int getVasos() {
            return vasos;
        }

        public void setVasos(int vasos) {
            this.vasos = vasos;
        }

        public MaquinaDeCafe() {
            //valores iniciales de la cafetera
            this.agua = 5000;
            this.cafe = 1000;
            this.crema = 1500;
            this.vasos = 50;


        }

        public void hacerAmericano() {

            if (agua >= 180 && cafe >= 15 && vasos > 0) {
                agua -= 180;
                cafe -= 15;
                vasos--;
                System.out.println("\nAqui esta tu cafe americano. Disfutalo");

            } else {
                if (agua < 180) {
                    System.out.println("No hay suficiente agua para hacer tu cafe americano.");
                } else if (cafe < 15) {
                    System.out.println("No hay suficiente cafe para hacer tu cafe americano.");
                } else if (vasos == 0) {
                    System.out.println("No quedan vasos para servir tu café americano, perdon.");
                }
            }
        }

        public void hacerExpreso() {

            if (agua >= 120 && cafe >= 20 && vasos > 0) {
                agua -= 120;
                cafe -= 20;
                vasos--;
                System.out.println("\nAqui esta tu cafe expreso. Disfutalo");

            } else {
                if (agua < 120) {
                    System.out.println("No hay suficiente agua para hacer tu cafe expreso.");
                } else if (cafe < 20) {
                    System.out.println("No hay suficiente cafe para hacer tu cafe expreso.");
                } else if (vasos == 0) {
                    System.out.println("No quedan vasos para servir tu café expreso, lo sentimos.");
                }
            }
        }

        public void hacerCapuchino() {

            if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
                agua -= 100;
                cafe -= 14;
                crema -= 70;
                vasos--;
                System.out.println("\nAqui esta tu capuchino.");

            } else {
                if (agua < 100) {
                    System.out.println("No hay suficiente agua para hacer tu capuchino.");
                } else if (cafe < 14) {
                    System.out.println("No hay suficiente cafe para hacer tu capuchino.");
                } else if (crema < 70) {
                    System.out.println("No hay suficiente crema para hacer tu capuchino.");
                } else if (vasos == 0) {
                    System.out.println("No quedan vasos para servir tu capuchino, lo sentimos mucho.");
                }
            }
        }

        //Para hacer los dif cafes

        public void hacerCafe(String tipo) {

            switch (tipo) {

                case "americano":
                    hacerAmericano();
                    System.out.println(toString());
                    break;

                case "expreso":
                    hacerExpreso();
                    System.out.println(toString());
                    break;


                case "capuchino":
                    hacerCapuchino();
                    System.out.println(toString());
                    break;

                case "estado":
                    System.out.println(toString() + "\n");
                    break;


                default:
                    System.out.println("\nSolo escribe el nombre del cafe o " + "estado" + " para ver las cantidades de la maquina");
                    break;


            }

        }

    }