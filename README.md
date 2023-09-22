# Run-Length Encoding (RLE) for Binary Images

## Overview

This project focuses on implementing Run-Length Encoding (RLE) for binary images using Java. The primary objective is to create a function that takes a binary image as input and generates the RLE code, which is then saved in a text file.

## What is Run-Length Encoding (RLE)?

Run-Length Encoding (RLE) is a straightforward and effective compression technique used to reduce data size, especially in binary images. It operates by replacing sequences of repeated identical values (runs) with a single value and a count of how many times it repeats.

In this project context:
- **White Pixels**: Runs of white pixels in the binary image are encoded.

## Output Format

Each run of white pixels is represented in the output as follows:
- The run starts with an opening parenthesis `(`.
- The row number where the run starts.
- The first column number where the run starts.
- The last column number where the run ends.
- A closing parenthesis `)`.

To enhance human readability, a space is added between every two successive numbers.

For example, if row 1 contains 3 white pixels from columns 5 to 7, it should appear in the output as:
`(1 5 7)`


## Starter Code

You can utilize the provided starter code (`RunLengthCode.java`) to load the binary image into your Java code and implement the RLE algorithm.

## Project Files

The project includes the following deliverables:

- **RunLengthCode.java**: The Java source code that implements the RLE algorithm for binary images.
- **Line_RLE.txt**: An output text file containing the RLE code corresponding to the image "binary_line.jpg."
- **Triangle_RLE.txt**: An output text file containing the RLE code corresponding to the image "binary_triangle.jpg."

## How to Run the Code

To run the code and generate RLE-encoded text files:

1. Load the provided starter code (`RunLengthCode.java`) into your Java development environment.

2. Implement the RLE algorithm as specified in the project description.

3. Apply your code to the provided binary images: "binary_line.jpg" and "binary_triangle.jpg" or any binary image you want.

4. Run your code to produce the RLE-encoded output.

## Usage

This project serves as a demonstration of your Java programming skills and your understanding of the Run-Length Encoding algorithm. The generated RLE-encoded text files serve as proof of successful implementation.

## About Run-Length Encoding

Run-Length Encoding (RLE) is a widely used data compression technique that simplifies the representation of consecutive data elements in a sequence. In the context of binary images, RLE helps reduce the size of image data by representing long sequences of identical pixels with a count value. This compression method is particularly efficient when dealing with images that contain large areas of uniform color or patterns.
