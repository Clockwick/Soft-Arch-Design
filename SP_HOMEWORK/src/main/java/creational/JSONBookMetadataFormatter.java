package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private List<JSONObject> bookList;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        bookList = new ArrayList<JSONObject>();
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject obj = new JSONObject();
        obj.put("ISBN", b.getISBN());
        List<String> authors = new ArrayList<String>();
        for (String author : b.getAuthors())
            authors.add(author);
        obj.put("Authors", authors);
        obj.put("Title", b.getTitle());
        obj.put("Publisher", b.getPublisher());
        bookList.add(obj);
        return this;
    }


    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("Books", bookList);
        return jsonObj.toString();
    }
}
