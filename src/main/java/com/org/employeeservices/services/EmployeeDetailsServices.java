package com.org.employeeservices.services;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsServices {

	public String getEmployeeDetails() {
		Map<String, String> empObj = new HashMap();
		String[] keys = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" };
		String[] values = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah", "Ivy", "Jack",
				"Kara", "Liam", "Mona", "Nina" };
		Map<Integer, String> namesMap = new TreeMap<>();
		namesMap.put(1, "Alice");
		namesMap.put(2, "Bob");
		namesMap.put(3, "Charlie");
		namesMap.put(4, "David");
		namesMap.put(5, "Eva");
		namesMap.put(6, "Frank");
		namesMap.put(7, "Grace");
		namesMap.put(8, "Hannah");
		namesMap.put(9, "Ivy");
		namesMap.put(10, "Jack");
		namesMap.put(11, "Kara");
		namesMap.put(12, "Liam");
		namesMap.put(13, "Mona");
		namesMap.put(14, "Nina");
		namesMap.put(15, "Oscar");
		return namesMap.toString();
	}

}
