package patterns.structuralDesignPatterns.compositePattern;

//Составной шаблон проектирования — это структурный шаблон проектирования,
// используемый для представления иерархий часть-целое в объектно-ориентированном языке программирования,
// таком как Java. Это позволяет клиентам единообразно обрабатывать отдельные объекты и композиции объектов.
// В этом шаблоне составной объект состоит из нескольких примитивных объектов,
// где каждый примитивный объект может иметь свое собственное поведение,
// а составной объект также может иметь свое собственное поведение.
// Составной объект можно рассматривать как единое целое или можно получить
// доступ к его отдельным частям и управлять ими, что упрощает организованное и эффективное управление сложными системами.

public class Client {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Composite composite = new Composite();
        composite.add(leaf);
        composite.operation();
    }
}

//В этом примере демонстрируется использование составного шаблона проектирования для
// построения древовидной структуры объектов, где каждый узел в дереве может быть листом
// (объект без дочерних элементов) или составным (объект с дочерними элементами).
// Составной объект реализует тот же интерфейс, что и конечный объект,
// и использует агрегацию для поддержки списка дочерних компонентов.