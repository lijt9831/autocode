package com.fanghuwang.yapin.controller;

import com.fanghuwang.yapin.beans.dto.HouseInfoDTO;
import com.fanghuwang.yapin.beans.query.GetHouseInfoByCertNoQO;
import com.fanghuwang.yapin.beans.query.GetHouseInfoByHouseCodeQO;
import com.fanghuwang.yapin.beans.query.ListHouseInfoByConditionQO;
import com.fanghuwang.yapin.biz.HouseInfoBusiness;
import com.fanghuwang.yapin.service.HouseInfoService;
import com.fanghuwang.common.beans.ResponseDTO;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ${program}
 * @description: ${description}
 * @author: ${author}
 * @create: ${createTime}
 **/

@Api(value = "${apivalue}", tags = {"${apitags}"})
@RestController
@RequestMapping("/${domainUrl}")
public class ${domainName}Controller {

    @Autowired
    private ${domainName}Service houseInfoService;

    @Autowired
    private ${domainName}Business houseInfoBusiness;

    @ApiOperation(value = "获取押品信息分页列表", httpMethod = "POST")
    @RequestMapping("/listHouseInfoByCondition")
    public ResponseDTO<PageInfo<HouseInfoDTO>> listHouseInfoByCondition(@Validated @RequestBody ListHouseInfoByConditionQO query) {
    return ResponseDTO.ok(houseInfoService.listHouseInfoByCondition(query));
    }

    @ApiOperation(value = "根据房产证号获取单个押品信息", httpMethod = "POST")
    @RequestMapping("/getHouseInfoByHouseCertNo")
    public ResponseDTO<HouseInfoDTO> getHouseInfoByHouseCertNo(@Validated @RequestBody GetHouseInfoByCertNoQO query) {
        return ResponseDTO.ok(houseInfoService.getHouseInfoByHouseCertNo(query));
    }

    @ApiOperation(value = "根据押品编号获取单个押品信息", httpMethod = "POST")
    @RequestMapping("/getHouseInfoByHouseCode")
    public ResponseDTO<HouseInfoDTO> getHouseInfoByHouseCode(@Validated @RequestBody GetHouseInfoByHouseCodeQO query) {
        return ResponseDTO.ok(houseInfoService.getHouseInfoByHouseCode(query));
    }

    @ApiOperation(value = "根据房产证号同步押品信息", httpMethod = "POST")
    @RequestMapping("/synchronizeByHouseCertNo")
    public ResponseDTO<HouseInfoDTO> synchronizeByHouseCertNo(@Validated @RequestBody HouseInfoDTO houseInfoDTO) {
        return ResponseDTO.ok(houseInfoBusiness.synchronizeHouseInfo(houseInfoDTO));
    }

    // TODO: 2018/12/26
    @ApiOperation(value = "根据编号更新押品信息", httpMethod = "POST", hidden = true)
    @RequestMapping("/updateByHouseCode")
    public ResponseDTO<HouseInfoDTO> updateByHouseCode(@Validated @RequestBody HouseInfoDTO houseInfoDTO) {
        return null;
    }

    // TODO: 2018/12/26
    @ApiOperation(value = "插入押品信息", httpMethod = "POST", hidden = true)
    @RequestMapping("/insertHouseInfo")
    public ResponseDTO<HouseInfoDTO> insertHouseInfo(@Validated @RequestBody HouseInfoDTO houseInfoDTO) {
        return null;
    }
}
