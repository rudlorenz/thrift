package org.apache.thrift;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.meta_data.FieldMetaData;
import org.junit.Assert;
import org.junit.Test;
import thrift.test.OneOfEachBeans;
import thrift.test.annotations.OneOfEachBeansWithAnnotations;

public class TestAnnotationMetadata {

    @Test
    public void testWithoutParamShouldGenerateEmpty() {
        Map<? extends TFieldIdEnum, FieldMetaData> structMetaDataMap = FieldMetaData.getStructMetaDataMap(OneOfEachBeans.class);
        {
            Map<String, String> metadata = structMetaDataMap.get(OneOfEachBeans._Fields.I16_LIST).getFieldAnnotations();
            Assert.assertEquals(Collections.emptyMap(), metadata);
        }
        {
            Map<String, String> metadata = structMetaDataMap.get(OneOfEachBeans._Fields.A_BITE).getFieldAnnotations();
            Assert.assertEquals(Collections.emptyMap(), metadata);
        }
    }

    @Test
    public void testGeneratedAnnotations() {
        Map<? extends TFieldIdEnum, FieldMetaData> structMetaDataMap = FieldMetaData.getStructMetaDataMap(OneOfEachBeansWithAnnotations.class);
        {
            Map<String, String> metadata = structMetaDataMap.get(OneOfEachBeansWithAnnotations._Fields.I16_LIST).getFieldAnnotations();
            Assert.assertEquals(Collections.emptyMap(), metadata);
        }
        {
            Map<String, String> metadata = structMetaDataMap.get(OneOfEachBeansWithAnnotations._Fields.A_BITE).getFieldAnnotations();
            Map<String, String> expected = new HashMap<>();
            expected.put("compression", "false");
            Assert.assertEquals(expected, metadata);
        }
    }
}
