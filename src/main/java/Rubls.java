public class Rubls {
    public String rusToCase(double countCheck){
        double rubles = countCheck;
        double lastTwoDigits = rubles % 100;
        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            return " рублей";
        } else {
            int lastDigit = (int) rubles % 10;
            switch (lastDigit) {
                case 1 : return "рубль";
                case 2 :
                case 3 :
                case 4 :  return "рубля";
                default : return "рублей";
            }
        }
    }
}