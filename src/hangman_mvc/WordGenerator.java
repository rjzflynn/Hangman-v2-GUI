
package hangman_mvc;

public class WordGenerator {

    final private String[] wordList = new String[]{"litter", "beanbag", "opening", "settlement", "table", "toaster", "operator", "time", "philosophy", "alexander", "republic", "general", "hannibal", "italy", "empire", "plato", "aristotle", "greece", "milatary", "exile"};
    final private String[] lordOfTheRingsWordList = new String[]{"frodo", "sam", "hobbit", "shire"};
    final private String[] philosophersWordList = new String[]{"plato", "aristotle", "descartes", "aquinas"};
    final private String[] greatHistoricalFiguresWordList = new String[]{"alexander", "hannibal", "napoleon", "cesar"};
    final private String[] bladeRunner = new String[]{"replicant", "vangelis", "deckard", "zhora"};
    final private String[] warcraft = new String[]{"orc", "human", "elf", "knight", "troll", "priest", "ballista", "peasant", "mage"};

    public String getWord() {
        return this.wordList[ (int) (Math.random() * wordList.length)];
    }


    public String getWord(String catagory) {
        switch (catagory) {

            case "Random":
                return this.wordList[ (int) (Math.random() * wordList.length)];

            case "Lord of The Rings":
                return this.lordOfTheRingsWordList[ (int) (Math.random() * lordOfTheRingsWordList.length)];

            case "Philosophers":
                return this.philosophersWordList[ (int) (Math.random() * philosophersWordList.length)];

            case "Great Hisorical Figures":
                return this.greatHistoricalFiguresWordList[ (int) (Math.random() * greatHistoricalFiguresWordList.length)];

            case "Warcraft":
                return this.warcraft[ (int) (Math.random() * warcraft.length)];
                
            case "Blade Runner":
            return this.bladeRunner[ (int) (Math.random() * bladeRunner.length)];
                
            default:
                return this.wordList[ (int) (Math.random() * wordList.length)];
        }

    }
}
