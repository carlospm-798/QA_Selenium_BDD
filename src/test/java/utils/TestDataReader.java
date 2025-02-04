package utils;

import lombok.experimental.UtilityClass;
import models.DataTableData;

@UtilityClass
public class TestDataReader {
    public final String TEST_DATA_PATH = JsonReader.RESOURCES_PATH + "testdata/";
    private final String DATA_TABLE_FILE_PATH = TEST_DATA_PATH + "dataTableData.json";

    public DataTableData getDataTableData() {
        return JsonReader.deserializeJson(DATA_TABLE_FILE_PATH, DataTableData.class);
    }
}
