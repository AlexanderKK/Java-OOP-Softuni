package _07ReflectionAndAnnotations._02Exercise.barracksWars.core.factories;

import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.Unit;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "_07ReflectionAndAnnotations._02Exercise.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) {
		// TODO: implement for problem 3

		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = unitClass.getDeclaredConstructor();

			return constructor.newInstance();
		} catch(ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
			System.out.println(e.getMessage());

			return null;
		}
	}
}
