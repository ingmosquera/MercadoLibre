# MercadoLibre

Esta app esta desarrollada utilizando el patron de arquitectura JetPack, así:
Paquete Adapter: Contiene clase adapter que permite la comunicacion para el reciclerView.
Paquete Model: Contiene: 
                        Clases POJO las cuales almacenan la información al llamar la api.
                        Clase ProductObservable, Utilizando el patron de diseño observable, esta clase esta pendiente de los cambios que se realizan para entregarlos al viewModel.
                        Clase ProductRepositoryImpl  implementa la interface repository y adiciona la lógica de negocio, llamando a la api y avisando al observer los cambios que se realice.
Paquete repository Contiene Interface ProductRepository la cual declara los métodos que seran implentados por la clase por la clase ProductRepositoryImpl    
Paquete service: Contiene la clase api server que se encarga de generar la conexcion necesaria para la api (se utliliza retrofit) 
                 Contiene la interface ProducService la cual provee los metodos que seran utilizados para llamar a la api.
Paquete util : Contiene una clase que ayuda en crear dinamicamente una tabla la cual es utilizada para mostrar el detalle del producto.
Paquete ViewModel: Administra los datos relacionados con la vista y maneja la comunicación con el resto de la aplicacion.
Paquete View: Contiene la parte logica de las actividades.



                
