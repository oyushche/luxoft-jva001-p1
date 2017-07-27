package com.luxoft.jva001p1.postoffice;

import java.util.Arrays;

public class PostOffice
{
    private Mail[] notDelivered;
    private Mail[] copyArchive;

    private Person[] addressBook;

    public PostOffice()
    {
        this.notDelivered = new Mail[0];
        this.copyArchive = new Mail[0];

        this.addressBook = new Person[0];

    }

    public boolean send(String text, Person from, Person to)
    {

//        if (! from and to exists or text = null or empty) ret false;

        Mail mail = new Mail(text);
        mail.setFrom(from);
        mail.setTo(to);

        notDelivered = addMailToArray(notDelivered, mail);

        return true;
    }

    public Mail[] checkMail(Person owner)
    {
        Mail[] result = new Mail[0];

        for (Mail mail : notDelivered)
        {
            if (mail.getTo().equals(owner))
            {
                result = addMailToArray(result, mail);

                copyArchive = addMailToArray(copyArchive, mail);
            }
        }

        if (result.length > 0)
        {
            notDelivered = removeFromArray(notDelivered, result);
        }

        return result;
    }

    private Mail[] removeFromArray(Mail[] srcArr, Mail[] data)
    {
        Mail[] result = new Mail[srcArr.length - data.length];

        int index = 0;

        for (Mail mail : srcArr)
        {
            if (!mail.getTo().equals(data[0].getTo()))
            {
                result[index++] = mail;
                continue;
            }

            boolean found = false;

            for (Mail toRemove : data)
            {
                if (mail == toRemove)
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                result[index++] = mail;
            }
        }

        return result;
    }

    private Mail[] addMailToArray(Mail[] result, Mail mail)
    {
        result = extendMail(result);
        result[result.length - 1] = mail;
        return result;
    }

    public void registerPerson(String name)
    {
        extendAddressBook();

        addressBook[addressBook.length - 1] = new Person(name);
    }

    private Mail[] extendMail(Mail[] src)
    {
        Mail[] result = new Mail[src.length + 1];

        System.arraycopy(src, 0, result, 0, src.length);

        return result;
    }

    private void extendAddressBook()
    {
        this.addressBook = Arrays.copyOf(addressBook, addressBook.length + 1);
    }

    public void importFromAddressBook(Person[] oldAddressBook)
    {
        this.addressBook = oldAddressBook;
    }

    public Person[] getAddressBook()
    {
        Person[] book = new Person[addressBook.length];
        System.arraycopy(addressBook, 0, book, 0, addressBook.length);

        return book;
    }
}
