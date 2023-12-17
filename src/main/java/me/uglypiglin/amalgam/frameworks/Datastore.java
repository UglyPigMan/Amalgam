package me.uglypiglin.amalgam.frameworks;

/**
 * A class all about storing mid-game data, like protection and other things.
 * You can add anything to the data store, but you need to keep in mind that it should have some common use, and if something is standardized, DO NOT TOUCH IT.
 *
 */
//I am not sure if we need this as of now
public class Datastore {


    public record BaseDatastoreEntry(int dayOfExpiration, String test) {

    }

}
