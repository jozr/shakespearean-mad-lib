import java.io.Console;
 
public class Prose {
    
    public static void main(String[] args) {
        Console console = System.console();
        String ageAsString = console.readLine("How old are you?  ");
        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            //Insert exit code
            console.printf("Sorry you must be 13 or older to use this program.\n");
            System.exit(0);
        }

        String noun = console.readLine("Noun:  ");
        String location = console.readLine("Specific location:  ");
        String bodyPart = console.readLine("Body part:  ");
        String adjective = console.readLine("Adjective:  ");
        String nameInput = console.readLine("Name:  ");
        String name = nameInput.substring(0, 1).toUpperCase() + nameInput.substring(1);
        String nameTwo;
        boolean isInvalidWord;
        do {
            nameTwo = console.readLine("Male name: ");
            isInvalidWord = (nameTwo.equalsIgnoreCase(name));
            if (isInvalidWord) {
                console.printf("You already used that name. Try again. \n\n");
            }
        } while(isInvalidWord);
        String verb = console.readLine("Verb:  ");
        String nameThree;
        boolean isAnotherInvalidWord;
        do {
            nameThree = console.readLine("Another name:  ");
            isAnotherInvalidWord = (nameThree.equalsIgnoreCase(name) ||
                                    nameThree.equalsIgnoreCase(nameTwo));
            if (isAnotherInvalidWord) {
                console.printf("You already used that name. Try again. \n\n");
            }
        } while(isAnotherInvalidWord);
        String pluralNoun = console.readLine("Plural noun:  ");
        String relative = console.readLine("Relative i.e., 'sister':  ");

        console.printf("~~~~~~~~~~~~~Shakespearean Prose~~~~~~~~~~~~~\n\n");
        console.printf("Give me my %s, put on my crown; I have\nImmortal longings in me: now no more\nThe juice of %s's grape shall moist this %s:\nYare, yare, %s %s; quick. Methinks I hear\n%s call; I see him rouse himself\nTo praise my noble act; I hear him %s\nThe luck of %s, which the gods give %s\nTo excuse their after wrath: %s, I come:\n\n", noun, location, bodyPart, adjective, name, nameTwo, verb, nameThree, pluralNoun, relative);
		    }
		    
		}