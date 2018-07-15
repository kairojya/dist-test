package com.dist;

import java.util.concurrent.ConcurrentMap;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class DistTest {

	public static void main(String[] args) {
		HazelcastInstance instance = Hazelcast.newHazelcastInstance();
		ConcurrentMap<Integer, String> map = instance.getMap("map");
		if (map.putIfAbsent(1, "") == null) {
			System.out.println("We are started!");
		}
	}

}