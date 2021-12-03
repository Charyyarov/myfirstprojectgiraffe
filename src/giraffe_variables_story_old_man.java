public class giraffe_variables_story_old_man {
    public static void main(String [] args) {

       String characterName = "Dave";
       int characterAge = 30;

        System.out.println("There once was a man named " + characterName + ",");
        System.out.println("he was " + characterAge + " years old. He really liked");
        characterName = "Jack";
        characterAge = 20;

        System.out.println("the name " + characterName + " , but didn't like being " + characterAge + ",");
        System.out.println("Most of his friends were also " + characterAge + " and one");
        System.out.println("of them was also named " + characterName + " .");
    }
}

/* so imagine you are going to have a big big text, and imagine you have to change the name of the character,
it would take so long for you to change the name from 'Tom' to 'Dave'.
Fortunately, you can use something called 'String' and 'int'. In String you can add letters of value,
and on int you can add whole numbers (without dots).

You don't need to add these "" for int. You can just add the number.

So with these Strings and int, I can quickly change the name of the character and the age.

On the other hand I can make it so the name and age of the character will not change after some point.
As you can see after the second line the name of the character is Jack. So you got the point. 
 */