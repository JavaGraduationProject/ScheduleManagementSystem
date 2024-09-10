package com.test.framework.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.project.system.dict.domain.DictData;
import com.test.project.system.dict.service.IDictDataService;
import com.test.project.system.dict.service.IDictTypeService;

/**
 * 
 * @author test
 */
@Service("dict")
public class DictService
{
    @Autowired
    private IDictTypeService dictTypeService;

    @Autowired
    private IDictDataService dictDataService;

    /**
     * 根据字典类型查询字典数据信息
     * 
     * @param dictType 字典类型
     * @return 参数键值
     */
    public List<DictData> getType(String dictType)
    {
        return dictTypeService.selectDictDataByType(dictType);
    }

    /**
     * 根据字典类型和字典键值查询字典数据信息
     * 
     * @param dictType 字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    public String getLabel(String dictType, String dictValue)
    {
        return dictDataService.selectDictLabel(dictType, dictValue);
    }
}
