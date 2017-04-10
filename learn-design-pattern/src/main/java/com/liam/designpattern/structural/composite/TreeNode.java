package com.liam.learn.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 组合模式（Composite） 把整体和局部的关系用树状结构描述出来，使得客户端把整体对象和局部对象同等看待。
 *
 * ======
 *
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 */
public class TreeNode {
	private String name;
	private TreeNode parent;
	private List<TreeNode> children = new ArrayList<TreeNode>();
	
	public void addChildren(TreeNode node){
		children.add(node);
	}
	
	public void removeChildren(TreeNode node){
		children.remove(node);
	}
	
	public TreeNode(String name){
		this.name = name;
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	
	
	
	
}
