# Encryption and Decryption Application

## Overview
This Java application implements a substitution cipher for encrypting and decrypting text. Users can define their own substitution keys to create custom encrypted messages. The program features a simple menu-driven interface for easy interaction.

## Features
- **Custom Substitution Keys:** Users can input a keyword that defines how letters are substituted in the encryption process.
- **Encryption and Decryption:** The application allows users to encrypt plain text and decrypt encrypted messages.
- **User-Friendly Interface:** A simple menu interface for selecting between encryption, decryption, or exiting the application.

## Technologies Used
- Java (JDK 8 or later)
- Java Standard Library

## Installation
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Calderndamin/Cryptographics
   cd encryption-decryption-app
   ```

2. **Compile the Application:**
   Open your terminal and navigate to the directory where the Java files are located, then compile the application using:
   ```bash
   javac App.java
   ```

3. **Run the Application:**
   Execute the application with the following command:
   ```bash
   java App
   ```

## Usage
1. **Launch the Application:** Run the compiled `App` class.
2. **Select an Option:**
   - **1. Encrypt:** Enter the keyword for substitution and the text you want to encrypt.
   - **2. Decrypt:** Enter the keyword used for encryption and the encrypted text to be decrypted.
   - **3. Exit:** Close the application.
3. **Input Example:**
   - Enter a keyword (e.g., `KEYWORD`).
   - Enter the text to be encrypted (e.g., `HELLO WORLD`).
   - The output will display the encrypted text.

## Example
```plaintext
Bienvenido al sistema de encriptado de CryptoSegre S.A

Seleccione alguna de las siguiente opciones:

1. Encriptar
2. Des-encriptar
3. Salir

> 1
Ingrese la palabra clave:
> KEYWORD
Ingrese el texto a encriptar:
> HELLO WORLD
Texto encriptado:
> [Encrypted Text]
```

## Contributing
Contributions are welcome! If you have suggestions for improvements or features, feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements
- Inspired by cryptographic principles and the desire to understand data security.
- Thanks to the Java community for their support and resources.

## Contact
For any questions or inquiries, please contact me at [caljosed@sheridancollege.ca](mailto:caljosed@sheridancollege.ca).
```
