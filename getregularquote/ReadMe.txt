Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the example you can execute the following Maven goal

    mvn camel:run

To deploy the example in OSGi. For example using Apache ServiceMix
or Apache Karaf. You will run the following command from its shell:

    osgi:install -s mvn:de.intersales.qbus/getregularquote

For more help see the Apache Camel documentation

    http://camel.apache.org/

