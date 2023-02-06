package patterns.structuralDesignPatterns.proxyPattern;


//Шаблон прокси в Java — это структурный шаблон проектирования, который предоставляет суррогатный объект или
// объект-заполнитель для другого объекта для управления доступом к нему.
// Он используется для создания объектов с таким же интерфейсом, как у исходного объекта,
// но с дополнительными функциями, такими как добавление безопасности или управление доступом к исходному объекту.
// Прокси-объект может действовать как посредник между клиентом и исходным объектом,
// перехватывая вызовы и манипулируя данными перед пересылкой запроса исходному объекту.

//Например, вы можете использовать прокси-объект для представления мощного ресурса,
// такого как большой файл изображения, который можно загрузить по требованию, а не загружать сразу.
// Прокси-объект можно использовать для управления доступом к ресурсу, снижения нагрузки на систему и контроля доступа к ресурсу.

public class ImageProxy implements Image {
    private RealImage realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

//В этом примере RealImage это исходный объект, представленный прокси-объектом, ImageProxy.
// Прокси-объект действует как посредник, контролирующий доступ к исходному объекту. Клиент использует
// Image интерфейс для взаимодействия с изображением, но фактическое изображение
// загружается только при display вызове метода. Это позволяет клиенту использовать изображение,
// не загружая его до тех пор, пока оно не понадобится.

//Преимущество прокси-шаблона
//Он обеспечивает защиту исходного объекта от внешнего мира.