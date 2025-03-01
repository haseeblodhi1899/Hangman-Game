public class HangmanArt {

    public static String getHangmanArt(int wrongGuesses) {

        return switch (wrongGuesses) {
            case 0 -> """
                         __________
                         |        |
                         |
                         |
                         |
                      ___|___
                      """;
            case 1 -> """
                         __________
                         |        |
                         |        O
                         |
                         |
                      ___|___
                      """;
            case 2 -> """
                         __________
                         |        |
                         |        O
                         |        |
                         |
                      ___|___
                      """;
            case 3 -> """
                         __________
                         |        |
                         |        O
                         |       /|
                         |
                      ___|___
                      """;
            case 4 -> """
                         __________
                         |        |
                         |        O
                         |       /|\\
                         |
                      ___|___
                      """;
            case 5 -> """
                        __________
                        |        |
                        |        O
                        |       /|\\
                        |       /
                     ___|___
                     """;
            case 6 -> """
                       __________
                       |        |
                       |        O
                       |       /|\\
                       |       / \\
                    ___|___
                    """;
            default -> "";
        };
    }
}
