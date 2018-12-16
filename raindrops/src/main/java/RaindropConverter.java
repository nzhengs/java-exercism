class RaindropConverter {

    String convert(int number) {
        String sound = "";
        if (number % 3 == 0) {
            sound += "Pling";
        }
        if (number % 5 == 0) {
            sound += "Plang";
        }
        if (number % 7 == 0) {
            sound += "Plong";
        }
        if (sound == ""){
            sound = String.valueOf(number);
        }
        return sound;
    }

}
