package com.luxoft.jva001p1.postoffice;

import java.util.Arrays;

public class PostDemo
{
    public static void main(String[] args)
    {
        PostOffice post = new PostOffice();

        Person[] addressBook = createSomePeople();
        post.importFromAddressBook(addressBook);

        post.send("Hi baby.", addressBook[0], addressBook[1]);

        Mail[] mails = post.checkMail(addressBook[2]);

        System.out.println("Nothing here? " + Arrays.toString(mails));

        mails = post.checkMail(addressBook[1]);

        System.out.println(addressBook[1].getName() + " gotMail from: "
                + mails[0].getFrom().getName() + " --> " + mails[0]);

        System.out.println(Arrays.toString(mails));
    }

    private static Person[] createSomePeople()
    {
        Person[] result = new Person[3];

        result[0] = new Person("Alexey");
        result[1] = new Person("Elena");
        result[2] = new Person("Roman");

        return result;
    }
}
