package com.wise.controller;
import com.wise.pojo.Items;
import com.wise.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @包名 com.wise.controller
 * @类名 ItemsController.java
 * @作者  MaWenZhe
 * @创建日期 2017年9月12日
 */
@Controller
@RequestMapping("items")
public class ItemsController {
	@Resource
	private ItemsService itemsService;

	/**
	 * 查询所有商品
	 * @param model
	 * @return
	 */
	@RequestMapping("show")
	public String show(Model model){

		List<Items> itemsList = itemsService.findAll();
		model.addAttribute("itemsList", itemsList);
		return "itemsList";
	}

	/**
	 * 预修改(根据id找对应的商品)
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("preEdit")
	public String preEdit(Integer id,Model model){
		Items item = itemsService.findById(id);
		model.addAttribute("item", item);
		return "editItem";
	}

	/**
	 * 修改商品
	 * @param item
	 * @return
	 */
	@RequestMapping("edit")
	public String edit(Items item){
		itemsService.edit(item);
		return "redirect:show";
	}

	/**
	 * 根据id删除商品
	 * @param id
	 * @return
	 */
	@RequestMapping("delete")
	public String delete(Integer id){
		itemsService.delete(id);
		return "redirect:show";
	}

	/**
	 * 跳转添加页面
	 * @return
	 */
	@RequestMapping("add")
	public String add(){
		return "addItem";
	}

	/**
	 * 添加商品
	 * @return
	 */
	@RequestMapping("addItem")
	public String addItem(Items item){
		itemsService.addItme(item);
		return "redirect:show";
	}
	/**
	 * 根据ids批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("deleteByIds")
	public String deleteByIds(Integer[] ids){

		for(Integer id : ids){
			itemsService.delete(id);
		}
		return "redirect:show";
	}

}


