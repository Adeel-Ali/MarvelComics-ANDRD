/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/26/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StorySummary 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5095104407480112700L;
    private String name;
    private String resourceURI;
    private String type;
    /** GETTER
     * The canonical name of the story.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The canonical name of the story.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * The path to the individual story resource.
     */
    @JsonGetter("resourceURI")
    public String getResourceURI ( ) { 
        return this.resourceURI;
    }
    
    /** SETTER
     * The path to the individual story resource.
     */
    @JsonSetter("resourceURI")
    public void setResourceURI (String value) { 
        this.resourceURI = value;
        notifyObservers(this.resourceURI);
    }
 
    /** GETTER
     * The type of the story (interior or cover).
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The type of the story (interior or cover).
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
        notifyObservers(this.type);
    }
 
}
 