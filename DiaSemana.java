public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public static boolean esDiaLaboral(DiaSemana dia) {
        switch (dia) {
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES:
                return true;

            case SABADO, DOMINGO:
                return false;

            default:
                break;
        }
        return false;
    }
}