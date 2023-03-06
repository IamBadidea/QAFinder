package com.explodeman.qufinder.model.item_repository.item_file_repository;

import com.explodeman.qufinder.model.Item;
import com.explodeman.qufinder.model.content_parser.ContentParser;
import com.explodeman.qufinder.model.file_reader.MyFileReader;
import com.explodeman.qufinder.model.item_repository.AbstractItemRepository;

import java.util.ArrayList;
import java.util.List;

public class ItemFileRepository extends AbstractItemRepository {

    private final MyFileReader myFileReader;
    private final ContentParser contentParser;
    private final List<Item> items;

    public ItemFileRepository(MyFileReader myFileReader, ContentParser contentParser) {
        this.myFileReader = myFileReader;
        this.contentParser = contentParser;
        items = createItems();
    }

    @Override
    protected List<Item> getItems() {
        return items;
    }

    private List<Item> createItems() {

        List<Item> items = new ArrayList<>();
        List<String> strings = myFileReader.read();
        List<String[]> list = contentParser.parse(strings);
        for (String[] array : list) {
            Item item = new Item(array[0], array[1]);
            items.add(item);
        }
        return items;
    }
}
