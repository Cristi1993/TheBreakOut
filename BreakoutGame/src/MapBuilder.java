

public class MapBuilder {
	Shape c;
	MapGenerator map;
	public MapBuilder(MapGenerator map, Shape c) {
		this.c = c;
		this.map = map;
																	
	}
	
	public void deseneaza() {
		for (int y = 0; y < map.map.length; y++) {
			for (int x = 0; x < map.map[y].length; x++) {
				if (c.continePunct(x, y)) {
					map.setBrickValue(1, x, y);
				}
			}
		}

	}

}
