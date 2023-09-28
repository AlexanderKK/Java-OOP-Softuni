package _07ReflectionAndAnnotations._02Exercise.barracksWars.core.commands;

import _07ReflectionAndAnnotations._02Exercise.barracksWars.annotations.Inject;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.Repository;

public class ReportCommand extends Command {

    @Inject
    private Repository repository;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return repository.getStatistics();
    }
}
