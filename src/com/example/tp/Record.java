package com.example.tp;

import java.io.Serializable;
import java.util.Objects;

public class Record implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private double score;

	public Record(int id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	@Override
	public String toString() {
		return id + " - " + name + " (" + score + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Record))
			return false;
		Record record = (Record) o;
		return id == record.id && Double.compare(record.score, score) == 0 && Objects.equals(name, record.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, score);
	}
}
